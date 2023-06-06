/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.model;

import java.util.ArrayList;
import java.util.Date;
import org.codehaus.jackson.annotate.JsonProperty;

public class BoletoResponse{
    public int id;
    public String expire_at;
    public Object paid_at;
    public Object description;
    public String status;
    public String registration_status;
    public String customer_person_name;
    public String customer_cnpj_cpf;
    public String customer_address;
    public String customer_state;
    public String customer_neighborhood;
    public String customer_zipcode;
    public Object customer_address_number;
    public Object customer_address_complement;
    public Object customer_phone_number;
    public Object customer_email;
    public Object customer_email_cc;
    public Object customer_ignore_email;
    public Object customer_ignore_sms;
    public Object customer_mobile_local_code;
    public Object customer_mobile_number;
    public Object customer_nickname;
    public Object customer_notes;
    public boolean created_via_api;
    public String customer_city_name;
    public double paid_amount;
    public double amount;
    public String url;
    public Formats formats;
    public Object meta;
    public Object fine_for_delay;
    public int fine_type;
    public Object fine_percentage;
    public Object fine_value;
    public Object days_for_fine;
    public Object late_payment_interest;
    public int interest_type;
    public Object interest_daily_value;
    public Object interest_daily_percentage;
    public Object interest_monthly_percentage;
    public Object days_for_interest;
    public int discount_type;
    public Object discount_limit_date;
    public Object discount_value;
    public Object discount_percentage;
    public Object days_for_revoke;
    public Object notes;
    public int payment_count;
    public int bank_billet_account_id;
    public String beneficiary_name;
    public String beneficiary_cnpj_cpf;
    public String beneficiary_address;
    public String beneficiary_assignor_code;
    public Object guarantor_name;
    public Object guarantor_cnpj_cpf;
    public String payment_place;
    public Object instructions;
    public Object document_date;
    public String document_type;
    public Object document_number;
    public String acceptance;
    public String processed_our_number;
    public String processed_our_number_raw;
    public String bank_contract_slug;
    public String agency_number;
    public String agency_digit;
    public String account_number;
    public String account_digit;
    public Object extra1;
    public Object extra1_digit;
    public Object extra2;
    public Object extra2_digit;
    public String line;
    public String our_number;
    public Object customer_subscription_id;
    public Object installment_total;
    public Object installment_number;
    public Object installment_id;
    public Object carne_url;
    public Object bank_billet_layout_id;
    public Date created_at;
    public Date updated_at;
    public ArrayList<Object> tags;
    public Object tag_list;
    public String document_type_label;
    public Object addons;
    public boolean ignore_email;
    public boolean ignore_sms;
    public Object sue_code;
    public Object revoke_code;
    public Object first_instruction;
    public Object second_instruction;
    public Object guarantor_address_number;
    public Object guarantor_neighborhood;
    public Object guarantor_phone_number;
    public Object guarantor_city_name;
    public Object guarantor_state;
    public Object guarantor_zipcode;
    public Object guarantor_address;
    public Object guarantor_address_complement;
    public String barcode;
    public Object registered_at;
    public boolean prevent_registration;
    public int customer_id;
    public Object control_number;
    public Object divergent_payment_type;
    public Object divergent_payment_value_type;
    public Object divergent_payment_maximum_value;
    public Object divergent_payment_minimum_value;
    public Object divergent_payment_maximum_percentage;
    public Object divergent_payment_minimum_percentage;
    public Object divergent_payment_limit;
    public Object days_for_discount;
    public Object days_for_second_discount;
    public Object second_discount_percentage;
    public Object second_discount_value;
    public Object days_for_third_discount;
    public Object third_discount_percentage;
    public Object third_discount_value;
    public Object days_for_sue;
    public Object days_for_negativation;
    public Object interest_percentage;
    public Object interest_value;
    public int interest_days_type;
    public Object customer_contact_person;
    public Object custom_attachment_name;
    public boolean split_payment;
    public int dispatch_type;
    public int charge_type;
    public Object custom_data;
    public Date issued_at;
    public String shorten_url;
    public boolean pix_enabled;
    public Object pix_qrcode;
    public Object password_protected_mode;
    public Object revoked_at;
    public Object recipient_account;
    public Object pix_txid;
    public Object cancel_type;
    public Object cancellation_reason;
    public boolean prevent_pix;
    public Object reduction_amount;
    public int instructions_mode;
    public ArrayList<Object> bank_billet_discharges;
    public ArrayList<Object> bank_billet_remittances;
    public ArrayList<Object> bank_billet_payments;
    public ArrayList<Object> bank_billet_registrations;
    public ArrayList<Object> bank_billet_split_accounts;
    public ArrayList<Object> pix;

    public BoletoResponse(int id, String expire_at, Object paid_at, Object description, String status, String registration_status, String customer_person_name, String customer_cnpj_cpf, String customer_address, String customer_state, String customer_neighborhood, String customer_zipcode, Object customer_address_number, Object customer_address_complement, Object customer_phone_number, Object customer_email, Object customer_email_cc, Object customer_ignore_email, Object customer_ignore_sms, Object customer_mobile_local_code, Object customer_mobile_number, Object customer_nickname, Object customer_notes, boolean created_via_api, String customer_city_name, double paid_amount, double amount, String url, Formats formats, Object meta, Object fine_for_delay, int fine_type, Object fine_percentage, Object fine_value, Object days_for_fine, Object late_payment_interest, int interest_type, Object interest_daily_value, Object interest_daily_percentage, Object interest_monthly_percentage, Object days_for_interest, int discount_type, Object discount_limit_date, Object discount_value, Object discount_percentage, Object days_for_revoke, Object notes, int payment_count, int bank_billet_account_id, String beneficiary_name, String beneficiary_cnpj_cpf, String beneficiary_address, String beneficiary_assignor_code, Object guarantor_name, Object guarantor_cnpj_cpf, String payment_place, Object instructions, Object document_date, String document_type, Object document_number, String acceptance, String processed_our_number, String processed_our_number_raw, String bank_contract_slug, String agency_number, String agency_digit, String account_number, String account_digit, Object extra1, Object extra1_digit, Object extra2, Object extra2_digit, String line, String our_number, Object customer_subscription_id, Object installment_total, Object installment_number, Object installment_id, Object carne_url, Object bank_billet_layout_id, Date created_at, Date updated_at, ArrayList<Object> tags, Object tag_list, String document_type_label, Object addons, boolean ignore_email, boolean ignore_sms, Object sue_code, Object revoke_code, Object first_instruction, Object second_instruction, Object guarantor_address_number, Object guarantor_neighborhood, Object guarantor_phone_number, Object guarantor_city_name, Object guarantor_state, Object guarantor_zipcode, Object guarantor_address, Object guarantor_address_complement, String barcode, Object registered_at, boolean prevent_registration, int customer_id, Object control_number, Object divergent_payment_type, Object divergent_payment_value_type, Object divergent_payment_maximum_value, Object divergent_payment_minimum_value, Object divergent_payment_maximum_percentage, Object divergent_payment_minimum_percentage, Object divergent_payment_limit, Object days_for_discount, Object days_for_second_discount, Object second_discount_percentage, Object second_discount_value, Object days_for_third_discount, Object third_discount_percentage, Object third_discount_value, Object days_for_sue, Object days_for_negativation, Object interest_percentage, Object interest_value, int interest_days_type, Object customer_contact_person, Object custom_attachment_name, boolean split_payment, int dispatch_type, int charge_type, Object custom_data, Date issued_at, String shorten_url, boolean pix_enabled, Object pix_qrcode, Object password_protected_mode, Object revoked_at, Object recipient_account, Object pix_txid, Object cancel_type, Object cancellation_reason, boolean prevent_pix, Object reduction_amount, int instructions_mode, ArrayList<Object> bank_billet_discharges, ArrayList<Object> bank_billet_remittances, ArrayList<Object> bank_billet_payments, ArrayList<Object> bank_billet_registrations, ArrayList<Object> bank_billet_split_accounts, ArrayList<Object> pix) {
        this.id = id;
        this.expire_at = expire_at;
        this.paid_at = paid_at;
        this.description = description;
        this.status = status;
        this.registration_status = registration_status;
        this.customer_person_name = customer_person_name;
        this.customer_cnpj_cpf = customer_cnpj_cpf;
        this.customer_address = customer_address;
        this.customer_state = customer_state;
        this.customer_neighborhood = customer_neighborhood;
        this.customer_zipcode = customer_zipcode;
        this.customer_address_number = customer_address_number;
        this.customer_address_complement = customer_address_complement;
        this.customer_phone_number = customer_phone_number;
        this.customer_email = customer_email;
        this.customer_email_cc = customer_email_cc;
        this.customer_ignore_email = customer_ignore_email;
        this.customer_ignore_sms = customer_ignore_sms;
        this.customer_mobile_local_code = customer_mobile_local_code;
        this.customer_mobile_number = customer_mobile_number;
        this.customer_nickname = customer_nickname;
        this.customer_notes = customer_notes;
        this.created_via_api = created_via_api;
        this.customer_city_name = customer_city_name;
        this.paid_amount = paid_amount;
        this.amount = amount;
        this.url = url;
        this.formats = formats;
        this.meta = meta;
        this.fine_for_delay = fine_for_delay;
        this.fine_type = fine_type;
        this.fine_percentage = fine_percentage;
        this.fine_value = fine_value;
        this.days_for_fine = days_for_fine;
        this.late_payment_interest = late_payment_interest;
        this.interest_type = interest_type;
        this.interest_daily_value = interest_daily_value;
        this.interest_daily_percentage = interest_daily_percentage;
        this.interest_monthly_percentage = interest_monthly_percentage;
        this.days_for_interest = days_for_interest;
        this.discount_type = discount_type;
        this.discount_limit_date = discount_limit_date;
        this.discount_value = discount_value;
        this.discount_percentage = discount_percentage;
        this.days_for_revoke = days_for_revoke;
        this.notes = notes;
        this.payment_count = payment_count;
        this.bank_billet_account_id = bank_billet_account_id;
        this.beneficiary_name = beneficiary_name;
        this.beneficiary_cnpj_cpf = beneficiary_cnpj_cpf;
        this.beneficiary_address = beneficiary_address;
        this.beneficiary_assignor_code = beneficiary_assignor_code;
        this.guarantor_name = guarantor_name;
        this.guarantor_cnpj_cpf = guarantor_cnpj_cpf;
        this.payment_place = payment_place;
        this.instructions = instructions;
        this.document_date = document_date;
        this.document_type = document_type;
        this.document_number = document_number;
        this.acceptance = acceptance;
        this.processed_our_number = processed_our_number;
        this.processed_our_number_raw = processed_our_number_raw;
        this.bank_contract_slug = bank_contract_slug;
        this.agency_number = agency_number;
        this.agency_digit = agency_digit;
        this.account_number = account_number;
        this.account_digit = account_digit;
        this.extra1 = extra1;
        this.extra1_digit = extra1_digit;
        this.extra2 = extra2;
        this.extra2_digit = extra2_digit;
        this.line = line;
        this.our_number = our_number;
        this.customer_subscription_id = customer_subscription_id;
        this.installment_total = installment_total;
        this.installment_number = installment_number;
        this.installment_id = installment_id;
        this.carne_url = carne_url;
        this.bank_billet_layout_id = bank_billet_layout_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.tags = tags;
        this.tag_list = tag_list;
        this.document_type_label = document_type_label;
        this.addons = addons;
        this.ignore_email = ignore_email;
        this.ignore_sms = ignore_sms;
        this.sue_code = sue_code;
        this.revoke_code = revoke_code;
        this.first_instruction = first_instruction;
        this.second_instruction = second_instruction;
        this.guarantor_address_number = guarantor_address_number;
        this.guarantor_neighborhood = guarantor_neighborhood;
        this.guarantor_phone_number = guarantor_phone_number;
        this.guarantor_city_name = guarantor_city_name;
        this.guarantor_state = guarantor_state;
        this.guarantor_zipcode = guarantor_zipcode;
        this.guarantor_address = guarantor_address;
        this.guarantor_address_complement = guarantor_address_complement;
        this.barcode = barcode;
        this.registered_at = registered_at;
        this.prevent_registration = prevent_registration;
        this.customer_id = customer_id;
        this.control_number = control_number;
        this.divergent_payment_type = divergent_payment_type;
        this.divergent_payment_value_type = divergent_payment_value_type;
        this.divergent_payment_maximum_value = divergent_payment_maximum_value;
        this.divergent_payment_minimum_value = divergent_payment_minimum_value;
        this.divergent_payment_maximum_percentage = divergent_payment_maximum_percentage;
        this.divergent_payment_minimum_percentage = divergent_payment_minimum_percentage;
        this.divergent_payment_limit = divergent_payment_limit;
        this.days_for_discount = days_for_discount;
        this.days_for_second_discount = days_for_second_discount;
        this.second_discount_percentage = second_discount_percentage;
        this.second_discount_value = second_discount_value;
        this.days_for_third_discount = days_for_third_discount;
        this.third_discount_percentage = third_discount_percentage;
        this.third_discount_value = third_discount_value;
        this.days_for_sue = days_for_sue;
        this.days_for_negativation = days_for_negativation;
        this.interest_percentage = interest_percentage;
        this.interest_value = interest_value;
        this.interest_days_type = interest_days_type;
        this.customer_contact_person = customer_contact_person;
        this.custom_attachment_name = custom_attachment_name;
        this.split_payment = split_payment;
        this.dispatch_type = dispatch_type;
        this.charge_type = charge_type;
        this.custom_data = custom_data;
        this.issued_at = issued_at;
        this.shorten_url = shorten_url;
        this.pix_enabled = pix_enabled;
        this.pix_qrcode = pix_qrcode;
        this.password_protected_mode = password_protected_mode;
        this.revoked_at = revoked_at;
        this.recipient_account = recipient_account;
        this.pix_txid = pix_txid;
        this.cancel_type = cancel_type;
        this.cancellation_reason = cancellation_reason;
        this.prevent_pix = prevent_pix;
        this.reduction_amount = reduction_amount;
        this.instructions_mode = instructions_mode;
        this.bank_billet_discharges = bank_billet_discharges;
        this.bank_billet_remittances = bank_billet_remittances;
        this.bank_billet_payments = bank_billet_payments;
        this.bank_billet_registrations = bank_billet_registrations;
        this.bank_billet_split_accounts = bank_billet_split_accounts;
        this.pix = pix;
    }

    public BoletoResponse() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpire_at() {
        return expire_at;
    }

    public void setExpire_at(String expire_at) {
        this.expire_at = expire_at;
    }

    public Object getPaid_at() {
        return paid_at;
    }

    public void setPaid_at(Object paid_at) {
        this.paid_at = paid_at;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegistration_status() {
        return registration_status;
    }

    public void setRegistration_status(String registration_status) {
        this.registration_status = registration_status;
    }

    public String getCustomer_person_name() {
        return customer_person_name;
    }

    public void setCustomer_person_name(String customer_person_name) {
        this.customer_person_name = customer_person_name;
    }

    public String getCustomer_cnpj_cpf() {
        return customer_cnpj_cpf;
    }

    public void setCustomer_cnpj_cpf(String customer_cnpj_cpf) {
        this.customer_cnpj_cpf = customer_cnpj_cpf;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_state() {
        return customer_state;
    }

    public void setCustomer_state(String customer_state) {
        this.customer_state = customer_state;
    }

    public String getCustomer_neighborhood() {
        return customer_neighborhood;
    }

    public void setCustomer_neighborhood(String customer_neighborhood) {
        this.customer_neighborhood = customer_neighborhood;
    }

    public String getCustomer_zipcode() {
        return customer_zipcode;
    }

    public void setCustomer_zipcode(String customer_zipcode) {
        this.customer_zipcode = customer_zipcode;
    }

    public Object getCustomer_address_number() {
        return customer_address_number;
    }

    public void setCustomer_address_number(Object customer_address_number) {
        this.customer_address_number = customer_address_number;
    }

    public Object getCustomer_address_complement() {
        return customer_address_complement;
    }

    public void setCustomer_address_complement(Object customer_address_complement) {
        this.customer_address_complement = customer_address_complement;
    }

    public Object getCustomer_phone_number() {
        return customer_phone_number;
    }

    public void setCustomer_phone_number(Object customer_phone_number) {
        this.customer_phone_number = customer_phone_number;
    }

    public Object getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(Object customer_email) {
        this.customer_email = customer_email;
    }

    public Object getCustomer_email_cc() {
        return customer_email_cc;
    }

    public void setCustomer_email_cc(Object customer_email_cc) {
        this.customer_email_cc = customer_email_cc;
    }

    public Object getCustomer_ignore_email() {
        return customer_ignore_email;
    }

    public void setCustomer_ignore_email(Object customer_ignore_email) {
        this.customer_ignore_email = customer_ignore_email;
    }

    public Object getCustomer_ignore_sms() {
        return customer_ignore_sms;
    }

    public void setCustomer_ignore_sms(Object customer_ignore_sms) {
        this.customer_ignore_sms = customer_ignore_sms;
    }

    public Object getCustomer_mobile_local_code() {
        return customer_mobile_local_code;
    }

    public void setCustomer_mobile_local_code(Object customer_mobile_local_code) {
        this.customer_mobile_local_code = customer_mobile_local_code;
    }

    public Object getCustomer_mobile_number() {
        return customer_mobile_number;
    }

    public void setCustomer_mobile_number(Object customer_mobile_number) {
        this.customer_mobile_number = customer_mobile_number;
    }

    public Object getCustomer_nickname() {
        return customer_nickname;
    }

    public void setCustomer_nickname(Object customer_nickname) {
        this.customer_nickname = customer_nickname;
    }

    public Object getCustomer_notes() {
        return customer_notes;
    }

    public void setCustomer_notes(Object customer_notes) {
        this.customer_notes = customer_notes;
    }

    public boolean isCreated_via_api() {
        return created_via_api;
    }

    public void setCreated_via_api(boolean created_via_api) {
        this.created_via_api = created_via_api;
    }

    public String getCustomer_city_name() {
        return customer_city_name;
    }

    public void setCustomer_city_name(String customer_city_name) {
        this.customer_city_name = customer_city_name;
    }

    public double getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(double paid_amount) {
        this.paid_amount = paid_amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Formats getFormats() {
        return formats;
    }

    public void setFormats(Formats formats) {
        this.formats = formats;
    }

    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public Object getFine_for_delay() {
        return fine_for_delay;
    }

    public void setFine_for_delay(Object fine_for_delay) {
        this.fine_for_delay = fine_for_delay;
    }

    public int getFine_type() {
        return fine_type;
    }

    public void setFine_type(int fine_type) {
        this.fine_type = fine_type;
    }

    public Object getFine_percentage() {
        return fine_percentage;
    }

    public void setFine_percentage(Object fine_percentage) {
        this.fine_percentage = fine_percentage;
    }

    public Object getFine_value() {
        return fine_value;
    }

    public void setFine_value(Object fine_value) {
        this.fine_value = fine_value;
    }

    public Object getDays_for_fine() {
        return days_for_fine;
    }

    public void setDays_for_fine(Object days_for_fine) {
        this.days_for_fine = days_for_fine;
    }

    public Object getLate_payment_interest() {
        return late_payment_interest;
    }

    public void setLate_payment_interest(Object late_payment_interest) {
        this.late_payment_interest = late_payment_interest;
    }

    public int getInterest_type() {
        return interest_type;
    }

    public void setInterest_type(int interest_type) {
        this.interest_type = interest_type;
    }

    public Object getInterest_daily_value() {
        return interest_daily_value;
    }

    public void setInterest_daily_value(Object interest_daily_value) {
        this.interest_daily_value = interest_daily_value;
    }

    public Object getInterest_daily_percentage() {
        return interest_daily_percentage;
    }

    public void setInterest_daily_percentage(Object interest_daily_percentage) {
        this.interest_daily_percentage = interest_daily_percentage;
    }

    public Object getInterest_monthly_percentage() {
        return interest_monthly_percentage;
    }

    public void setInterest_monthly_percentage(Object interest_monthly_percentage) {
        this.interest_monthly_percentage = interest_monthly_percentage;
    }

    public Object getDays_for_interest() {
        return days_for_interest;
    }

    public void setDays_for_interest(Object days_for_interest) {
        this.days_for_interest = days_for_interest;
    }

    public int getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(int discount_type) {
        this.discount_type = discount_type;
    }

    public Object getDiscount_limit_date() {
        return discount_limit_date;
    }

    public void setDiscount_limit_date(Object discount_limit_date) {
        this.discount_limit_date = discount_limit_date;
    }

    public Object getDiscount_value() {
        return discount_value;
    }

    public void setDiscount_value(Object discount_value) {
        this.discount_value = discount_value;
    }

    public Object getDiscount_percentage() {
        return discount_percentage;
    }

    public void setDiscount_percentage(Object discount_percentage) {
        this.discount_percentage = discount_percentage;
    }

    public Object getDays_for_revoke() {
        return days_for_revoke;
    }

    public void setDays_for_revoke(Object days_for_revoke) {
        this.days_for_revoke = days_for_revoke;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public int getPayment_count() {
        return payment_count;
    }

    public void setPayment_count(int payment_count) {
        this.payment_count = payment_count;
    }

    public int getBank_billet_account_id() {
        return bank_billet_account_id;
    }

    public void setBank_billet_account_id(int bank_billet_account_id) {
        this.bank_billet_account_id = bank_billet_account_id;
    }

    public String getBeneficiary_name() {
        return beneficiary_name;
    }

    public void setBeneficiary_name(String beneficiary_name) {
        this.beneficiary_name = beneficiary_name;
    }

    public String getBeneficiary_cnpj_cpf() {
        return beneficiary_cnpj_cpf;
    }

    public void setBeneficiary_cnpj_cpf(String beneficiary_cnpj_cpf) {
        this.beneficiary_cnpj_cpf = beneficiary_cnpj_cpf;
    }

    public String getBeneficiary_address() {
        return beneficiary_address;
    }

    public void setBeneficiary_address(String beneficiary_address) {
        this.beneficiary_address = beneficiary_address;
    }

    public String getBeneficiary_assignor_code() {
        return beneficiary_assignor_code;
    }

    public void setBeneficiary_assignor_code(String beneficiary_assignor_code) {
        this.beneficiary_assignor_code = beneficiary_assignor_code;
    }

    public Object getGuarantor_name() {
        return guarantor_name;
    }

    public void setGuarantor_name(Object guarantor_name) {
        this.guarantor_name = guarantor_name;
    }

    public Object getGuarantor_cnpj_cpf() {
        return guarantor_cnpj_cpf;
    }

    public void setGuarantor_cnpj_cpf(Object guarantor_cnpj_cpf) {
        this.guarantor_cnpj_cpf = guarantor_cnpj_cpf;
    }

    public String getPayment_place() {
        return payment_place;
    }

    public void setPayment_place(String payment_place) {
        this.payment_place = payment_place;
    }

    public Object getInstructions() {
        return instructions;
    }

    public void setInstructions(Object instructions) {
        this.instructions = instructions;
    }

    public Object getDocument_date() {
        return document_date;
    }

    public void setDocument_date(Object document_date) {
        this.document_date = document_date;
    }

    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    public Object getDocument_number() {
        return document_number;
    }

    public void setDocument_number(Object document_number) {
        this.document_number = document_number;
    }

    public String getAcceptance() {
        return acceptance;
    }

    public void setAcceptance(String acceptance) {
        this.acceptance = acceptance;
    }

    public String getProcessed_our_number() {
        return processed_our_number;
    }

    public void setProcessed_our_number(String processed_our_number) {
        this.processed_our_number = processed_our_number;
    }

    public String getProcessed_our_number_raw() {
        return processed_our_number_raw;
    }

    public void setProcessed_our_number_raw(String processed_our_number_raw) {
        this.processed_our_number_raw = processed_our_number_raw;
    }

    public String getBank_contract_slug() {
        return bank_contract_slug;
    }

    public void setBank_contract_slug(String bank_contract_slug) {
        this.bank_contract_slug = bank_contract_slug;
    }

    public String getAgency_number() {
        return agency_number;
    }

    public void setAgency_number(String agency_number) {
        this.agency_number = agency_number;
    }

    public String getAgency_digit() {
        return agency_digit;
    }

    public void setAgency_digit(String agency_digit) {
        this.agency_digit = agency_digit;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_digit() {
        return account_digit;
    }

    public void setAccount_digit(String account_digit) {
        this.account_digit = account_digit;
    }

    public Object getExtra1() {
        return extra1;
    }

    public void setExtra1(Object extra1) {
        this.extra1 = extra1;
    }

    public Object getExtra1_digit() {
        return extra1_digit;
    }

    public void setExtra1_digit(Object extra1_digit) {
        this.extra1_digit = extra1_digit;
    }

    public Object getExtra2() {
        return extra2;
    }

    public void setExtra2(Object extra2) {
        this.extra2 = extra2;
    }

    public Object getExtra2_digit() {
        return extra2_digit;
    }

    public void setExtra2_digit(Object extra2_digit) {
        this.extra2_digit = extra2_digit;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getOur_number() {
        return our_number;
    }

    public void setOur_number(String our_number) {
        this.our_number = our_number;
    }

    public Object getCustomer_subscription_id() {
        return customer_subscription_id;
    }

    public void setCustomer_subscription_id(Object customer_subscription_id) {
        this.customer_subscription_id = customer_subscription_id;
    }

    public Object getInstallment_total() {
        return installment_total;
    }

    public void setInstallment_total(Object installment_total) {
        this.installment_total = installment_total;
    }

    public Object getInstallment_number() {
        return installment_number;
    }

    public void setInstallment_number(Object installment_number) {
        this.installment_number = installment_number;
    }

    public Object getInstallment_id() {
        return installment_id;
    }

    public void setInstallment_id(Object installment_id) {
        this.installment_id = installment_id;
    }

    public Object getCarne_url() {
        return carne_url;
    }

    public void setCarne_url(Object carne_url) {
        this.carne_url = carne_url;
    }

    public Object getBank_billet_layout_id() {
        return bank_billet_layout_id;
    }

    public void setBank_billet_layout_id(Object bank_billet_layout_id) {
        this.bank_billet_layout_id = bank_billet_layout_id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public ArrayList<Object> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Object> tags) {
        this.tags = tags;
    }

    public Object getTag_list() {
        return tag_list;
    }

    public void setTag_list(Object tag_list) {
        this.tag_list = tag_list;
    }

    public String getDocument_type_label() {
        return document_type_label;
    }

    public void setDocument_type_label(String document_type_label) {
        this.document_type_label = document_type_label;
    }

    public Object getAddons() {
        return addons;
    }

    public void setAddons(Object addons) {
        this.addons = addons;
    }

    public boolean isIgnore_email() {
        return ignore_email;
    }

    public void setIgnore_email(boolean ignore_email) {
        this.ignore_email = ignore_email;
    }

    public boolean isIgnore_sms() {
        return ignore_sms;
    }

    public void setIgnore_sms(boolean ignore_sms) {
        this.ignore_sms = ignore_sms;
    }

    public Object getSue_code() {
        return sue_code;
    }

    public void setSue_code(Object sue_code) {
        this.sue_code = sue_code;
    }

    public Object getRevoke_code() {
        return revoke_code;
    }

    public void setRevoke_code(Object revoke_code) {
        this.revoke_code = revoke_code;
    }

    public Object getFirst_instruction() {
        return first_instruction;
    }

    public void setFirst_instruction(Object first_instruction) {
        this.first_instruction = first_instruction;
    }

    public Object getSecond_instruction() {
        return second_instruction;
    }

    public void setSecond_instruction(Object second_instruction) {
        this.second_instruction = second_instruction;
    }

    public Object getGuarantor_address_number() {
        return guarantor_address_number;
    }

    public void setGuarantor_address_number(Object guarantor_address_number) {
        this.guarantor_address_number = guarantor_address_number;
    }

    public Object getGuarantor_neighborhood() {
        return guarantor_neighborhood;
    }

    public void setGuarantor_neighborhood(Object guarantor_neighborhood) {
        this.guarantor_neighborhood = guarantor_neighborhood;
    }

    public Object getGuarantor_phone_number() {
        return guarantor_phone_number;
    }

    public void setGuarantor_phone_number(Object guarantor_phone_number) {
        this.guarantor_phone_number = guarantor_phone_number;
    }

    public Object getGuarantor_city_name() {
        return guarantor_city_name;
    }

    public void setGuarantor_city_name(Object guarantor_city_name) {
        this.guarantor_city_name = guarantor_city_name;
    }

    public Object getGuarantor_state() {
        return guarantor_state;
    }

    public void setGuarantor_state(Object guarantor_state) {
        this.guarantor_state = guarantor_state;
    }

    public Object getGuarantor_zipcode() {
        return guarantor_zipcode;
    }

    public void setGuarantor_zipcode(Object guarantor_zipcode) {
        this.guarantor_zipcode = guarantor_zipcode;
    }

    public Object getGuarantor_address() {
        return guarantor_address;
    }

    public void setGuarantor_address(Object guarantor_address) {
        this.guarantor_address = guarantor_address;
    }

    public Object getGuarantor_address_complement() {
        return guarantor_address_complement;
    }

    public void setGuarantor_address_complement(Object guarantor_address_complement) {
        this.guarantor_address_complement = guarantor_address_complement;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Object getRegistered_at() {
        return registered_at;
    }

    public void setRegistered_at(Object registered_at) {
        this.registered_at = registered_at;
    }

    public boolean isPrevent_registration() {
        return prevent_registration;
    }

    public void setPrevent_registration(boolean prevent_registration) {
        this.prevent_registration = prevent_registration;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Object getControl_number() {
        return control_number;
    }

    public void setControl_number(Object control_number) {
        this.control_number = control_number;
    }

    public Object getDivergent_payment_type() {
        return divergent_payment_type;
    }

    public void setDivergent_payment_type(Object divergent_payment_type) {
        this.divergent_payment_type = divergent_payment_type;
    }

    public Object getDivergent_payment_value_type() {
        return divergent_payment_value_type;
    }

    public void setDivergent_payment_value_type(Object divergent_payment_value_type) {
        this.divergent_payment_value_type = divergent_payment_value_type;
    }

    public Object getDivergent_payment_maximum_value() {
        return divergent_payment_maximum_value;
    }

    public void setDivergent_payment_maximum_value(Object divergent_payment_maximum_value) {
        this.divergent_payment_maximum_value = divergent_payment_maximum_value;
    }

    public Object getDivergent_payment_minimum_value() {
        return divergent_payment_minimum_value;
    }

    public void setDivergent_payment_minimum_value(Object divergent_payment_minimum_value) {
        this.divergent_payment_minimum_value = divergent_payment_minimum_value;
    }

    public Object getDivergent_payment_maximum_percentage() {
        return divergent_payment_maximum_percentage;
    }

    public void setDivergent_payment_maximum_percentage(Object divergent_payment_maximum_percentage) {
        this.divergent_payment_maximum_percentage = divergent_payment_maximum_percentage;
    }

    public Object getDivergent_payment_minimum_percentage() {
        return divergent_payment_minimum_percentage;
    }

    public void setDivergent_payment_minimum_percentage(Object divergent_payment_minimum_percentage) {
        this.divergent_payment_minimum_percentage = divergent_payment_minimum_percentage;
    }

    public Object getDivergent_payment_limit() {
        return divergent_payment_limit;
    }

    public void setDivergent_payment_limit(Object divergent_payment_limit) {
        this.divergent_payment_limit = divergent_payment_limit;
    }

    public Object getDays_for_discount() {
        return days_for_discount;
    }

    public void setDays_for_discount(Object days_for_discount) {
        this.days_for_discount = days_for_discount;
    }

    public Object getDays_for_second_discount() {
        return days_for_second_discount;
    }

    public void setDays_for_second_discount(Object days_for_second_discount) {
        this.days_for_second_discount = days_for_second_discount;
    }

    public Object getSecond_discount_percentage() {
        return second_discount_percentage;
    }

    public void setSecond_discount_percentage(Object second_discount_percentage) {
        this.second_discount_percentage = second_discount_percentage;
    }

    public Object getSecond_discount_value() {
        return second_discount_value;
    }

    public void setSecond_discount_value(Object second_discount_value) {
        this.second_discount_value = second_discount_value;
    }

    public Object getDays_for_third_discount() {
        return days_for_third_discount;
    }

    public void setDays_for_third_discount(Object days_for_third_discount) {
        this.days_for_third_discount = days_for_third_discount;
    }

    public Object getThird_discount_percentage() {
        return third_discount_percentage;
    }

    public void setThird_discount_percentage(Object third_discount_percentage) {
        this.third_discount_percentage = third_discount_percentage;
    }

    public Object getThird_discount_value() {
        return third_discount_value;
    }

    public void setThird_discount_value(Object third_discount_value) {
        this.third_discount_value = third_discount_value;
    }

    public Object getDays_for_sue() {
        return days_for_sue;
    }

    public void setDays_for_sue(Object days_for_sue) {
        this.days_for_sue = days_for_sue;
    }

    public Object getDays_for_negativation() {
        return days_for_negativation;
    }

    public void setDays_for_negativation(Object days_for_negativation) {
        this.days_for_negativation = days_for_negativation;
    }

    public Object getInterest_percentage() {
        return interest_percentage;
    }

    public void setInterest_percentage(Object interest_percentage) {
        this.interest_percentage = interest_percentage;
    }

    public Object getInterest_value() {
        return interest_value;
    }

    public void setInterest_value(Object interest_value) {
        this.interest_value = interest_value;
    }

    public int getInterest_days_type() {
        return interest_days_type;
    }

    public void setInterest_days_type(int interest_days_type) {
        this.interest_days_type = interest_days_type;
    }

    public Object getCustomer_contact_person() {
        return customer_contact_person;
    }

    public void setCustomer_contact_person(Object customer_contact_person) {
        this.customer_contact_person = customer_contact_person;
    }

    public Object getCustom_attachment_name() {
        return custom_attachment_name;
    }

    public void setCustom_attachment_name(Object custom_attachment_name) {
        this.custom_attachment_name = custom_attachment_name;
    }

    public boolean isSplit_payment() {
        return split_payment;
    }

    public void setSplit_payment(boolean split_payment) {
        this.split_payment = split_payment;
    }

    public int getDispatch_type() {
        return dispatch_type;
    }

    public void setDispatch_type(int dispatch_type) {
        this.dispatch_type = dispatch_type;
    }

    public int getCharge_type() {
        return charge_type;
    }

    public void setCharge_type(int charge_type) {
        this.charge_type = charge_type;
    }

    public Object getCustom_data() {
        return custom_data;
    }

    public void setCustom_data(Object custom_data) {
        this.custom_data = custom_data;
    }

    public Date getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(Date issued_at) {
        this.issued_at = issued_at;
    }

    public String getShorten_url() {
        return shorten_url;
    }

    public void setShorten_url(String shorten_url) {
        this.shorten_url = shorten_url;
    }

    public boolean isPix_enabled() {
        return pix_enabled;
    }

    public void setPix_enabled(boolean pix_enabled) {
        this.pix_enabled = pix_enabled;
    }

    public Object getPix_qrcode() {
        return pix_qrcode;
    }

    public void setPix_qrcode(Object pix_qrcode) {
        this.pix_qrcode = pix_qrcode;
    }

    public Object getPassword_protected_mode() {
        return password_protected_mode;
    }

    public void setPassword_protected_mode(Object password_protected_mode) {
        this.password_protected_mode = password_protected_mode;
    }

    public Object getRevoked_at() {
        return revoked_at;
    }

    public void setRevoked_at(Object revoked_at) {
        this.revoked_at = revoked_at;
    }

    public Object getRecipient_account() {
        return recipient_account;
    }

    public void setRecipient_account(Object recipient_account) {
        this.recipient_account = recipient_account;
    }

    public Object getPix_txid() {
        return pix_txid;
    }

    public void setPix_txid(Object pix_txid) {
        this.pix_txid = pix_txid;
    }

    public Object getCancel_type() {
        return cancel_type;
    }

    public void setCancel_type(Object cancel_type) {
        this.cancel_type = cancel_type;
    }

    public Object getCancellation_reason() {
        return cancellation_reason;
    }

    public void setCancellation_reason(Object cancellation_reason) {
        this.cancellation_reason = cancellation_reason;
    }

    public boolean isPrevent_pix() {
        return prevent_pix;
    }

    public void setPrevent_pix(boolean prevent_pix) {
        this.prevent_pix = prevent_pix;
    }

    public Object getReduction_amount() {
        return reduction_amount;
    }

    public void setReduction_amount(Object reduction_amount) {
        this.reduction_amount = reduction_amount;
    }

    public int getInstructions_mode() {
        return instructions_mode;
    }

    public void setInstructions_mode(int instructions_mode) {
        this.instructions_mode = instructions_mode;
    }

    public ArrayList<Object> getBank_billet_discharges() {
        return bank_billet_discharges;
    }

    public void setBank_billet_discharges(ArrayList<Object> bank_billet_discharges) {
        this.bank_billet_discharges = bank_billet_discharges;
    }

    public ArrayList<Object> getBank_billet_remittances() {
        return bank_billet_remittances;
    }

    public void setBank_billet_remittances(ArrayList<Object> bank_billet_remittances) {
        this.bank_billet_remittances = bank_billet_remittances;
    }

    public ArrayList<Object> getBank_billet_payments() {
        return bank_billet_payments;
    }

    public void setBank_billet_payments(ArrayList<Object> bank_billet_payments) {
        this.bank_billet_payments = bank_billet_payments;
    }

    public ArrayList<Object> getBank_billet_registrations() {
        return bank_billet_registrations;
    }

    public void setBank_billet_registrations(ArrayList<Object> bank_billet_registrations) {
        this.bank_billet_registrations = bank_billet_registrations;
    }

    public ArrayList<Object> getBank_billet_split_accounts() {
        return bank_billet_split_accounts;
    }

    public void setBank_billet_split_accounts(ArrayList<Object> bank_billet_split_accounts) {
        this.bank_billet_split_accounts = bank_billet_split_accounts;
    }

    public ArrayList<Object> getPix() {
        return pix;
    }

    public void setPix(ArrayList<Object> pix) {
        this.pix = pix;
    }
    
    
}