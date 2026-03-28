package br.edu.utfpr.appcontatos.ui.contact.form

import br.edu.utfpr.appcontatos.data.Contact

data class ContactFormState(
    val contactId: Int = 0,
    val isLoading: Boolean = false,
    val contact: Contact = Contact(),
    val hasErrorLoading: Boolean = false
) {
    val isNewContact get(): Boolean = contactId <= 0
}
