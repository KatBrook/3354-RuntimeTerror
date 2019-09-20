Definitions, Acronyms, and Abbreviations:

SMS: Short Message Service

Blacklist: A list of people or things that are regarded as unacceptable or untrustworthy and should be excluded or avoided. By blacklisting or blocking someone on your phone, you are preventing that person from being able to contact you either from calling or texting.


Functional Requirements:

1. The user shall be able to add, view, edit, and delete their contacts
    1.1. The system shall require one of the following information from the user to create a contact: Name, Address, Email, Phone Number, or Picture.
          1.1.1. The system shall not create a contact if all of the following information is blank: Name, Address, Email, Phone Number, and Picture.
    1.2. The system shall allow the user to view a contact by clicking on the tab corresponding to the contact organization.
    1.3. The system shall allow the user to edit the information they provided for a contact.
          1.3.1. The system shall delete a contact if the user edited the following contact information in a contacts profile to be blank: Name, Address, Email, Phone Number, and Picture.
                  1.3.1.1. The system shall display a message prompting the user if they wish to leave the contact’s information blank and to proceed with the deletion of the contact
    1.4. The system shall allow the user to delete a contact and present a message prompting the user if they wish to proceed with the deletion.
    1.5. The system shall store the information in the contact manager app.


2.

3.

4.

5. The system shall allow the user to directly make phone calls and send SMS from the contact view 
    5.1. The system shall display a button to call a contact in the contacts profile in the contact manager
          5.1.1. The system shall display a popup to allow the user to choose which phone number to call if the contact has multiple phone numbers 
          5.1.2. The system shall immediately call the number chosen by the user for that contact or call the only number under that contacts profile
          5.1.3. The system should go to voicemail if the phone number called is invalid or not answered
    5.2. The system shall display a button to send an sms to a contact in the contacts profile in the contact manager
          5.2.1. The system shall take the user to the sms app to send a message with the contacts phone number filled in as the receiver of the message

6.

7.

8.

9.

10.

11.

12.
  
  
Use Case Diagram:


![UseCase](https://user-images.githubusercontent.com/50084833/65300539-6d025900-db39-11e9-86bb-8b7a3951292c.PNG)



