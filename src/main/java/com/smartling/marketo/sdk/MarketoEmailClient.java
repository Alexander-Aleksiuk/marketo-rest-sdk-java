package com.smartling.marketo.sdk;

import com.smartling.marketo.sdk.domain.email.Email;
import com.smartling.marketo.sdk.domain.email.EmailContentItem;
import com.smartling.marketo.sdk.domain.email.EmailTextContentItem;
import com.smartling.marketo.sdk.domain.folder.FolderId;

import java.util.List;

public interface MarketoEmailClient extends MarketoClient {
    List<Email> listEmails(int offset, int limit) throws MarketoApiException;

    List<Email> listEmails(int offset, int limit, FolderId folder, Email.Status status) throws MarketoApiException;

    Email loadEmailById(int id) throws MarketoApiException;

    List<Email> getEmailsByName(String name, FolderId folderId, Email.Status status) throws MarketoApiException;

    List<EmailContentItem> loadEmailContent(int emailId) throws MarketoApiException;

    Email cloneEmail(int sourceEmailId, String newEmailName, FolderId folderId) throws MarketoApiException;

    Email cloneEmail(Email existingEmail, String newEmailName) throws MarketoApiException;

    void updateEmailContent(int id, List<EmailTextContentItem> contentItems) throws MarketoApiException;

    void updateEmailContentItem(int id, EmailTextContentItem contentItem) throws MarketoApiException;

    void updateEmail(Email email) throws MarketoApiException;
}