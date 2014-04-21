/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contact.form;

import contact.form.Address;
import contact.form.Contact;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author daniel
 */
public class ContactValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return (Contact.class.equals(clazz) || Address.class.equals(clazz));
    }

    @Override
    public void validate(Object target, Errors errors) {
        
        if (target instanceof Contact) {
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telephone", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.street", "field.required");
            ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address.postalcode", "field.required");
        }
    }
}
