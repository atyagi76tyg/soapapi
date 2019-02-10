package pojo;


public class CreateCustomer2
{
	private Invoice_settings invoice_settings;

    private Metadata metadata;

    private Subscriptions subscriptions;

    private String account_balance;

    private String livemode;

    private Sources sources;

    private String default_source;

    private String invoice_prefix;

    private String created;

    private String description;

    private String discount;

    private String tax_info_verification;

    private Payment_methods payment_methods;

    private String shipping;

    private String tax_info;

    private String delinquent;

    private String currency;

    private String id;

    private String email;

    private String object;

    public Invoice_settings getInvoice_settings ()
    {
        return invoice_settings;
    }

    public void setInvoice_settings (Invoice_settings invoice_settings)
    {
        this.invoice_settings = invoice_settings;
    }

    public Metadata getMetadata ()
    {
        return metadata;
    }

    public void setMetadata (Metadata metadata)
    {
        this.metadata = metadata;
    }

    public Subscriptions getSubscriptions ()
    {
        return subscriptions;
    }

    public void setSubscriptions (Subscriptions subscriptions)
    {
        this.subscriptions = subscriptions;
    }

    public String getAccount_balance ()
    {
        return account_balance;
    }

    public void setAccount_balance (String account_balance)
    {
        this.account_balance = account_balance;
    }

    public String getLivemode ()
    {
        return livemode;
    }

    public void setLivemode (String livemode)
    {
        this.livemode = livemode;
    }

    public Sources getSources ()
    {
        return sources;
    }

    public void setSources (Sources sources)
    {
        this.sources = sources;
    }

    public String getDefault_source ()
    {
        return default_source;
    }

    public void setDefault_source (String default_source)
    {
        this.default_source = default_source;
    }

    public String getInvoice_prefix ()
    {
        return invoice_prefix;
    }

    public void setInvoice_prefix (String invoice_prefix)
    {
        this.invoice_prefix = invoice_prefix;
    }

    public String getCreated ()
    {
        return created;
    }

    public void setCreated (String created)
    {
        this.created = created;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getDiscount ()
    {
        return discount;
    }

    public void setDiscount (String discount)
    {
        this.discount = discount;
    }

    public String getTax_info_verification ()
    {
        return tax_info_verification;
    }

    public void setTax_info_verification (String tax_info_verification)
    {
        this.tax_info_verification = tax_info_verification;
    }

    public Payment_methods getPayment_methods ()
    {
        return payment_methods;
    }

    public void setPayment_methods (Payment_methods payment_methods)
    {
        this.payment_methods = payment_methods;
    }

    public String getShipping ()
    {
        return shipping;
    }

    public void setShipping (String shipping)
    {
        this.shipping = shipping;
    }

    public String getTax_info ()
    {
        return tax_info;
    }

    public void setTax_info (String tax_info)
    {
        this.tax_info = tax_info;
    }

    public String getDelinquent ()
    {
        return delinquent;
    }

    public void setDelinquent (String delinquent)
    {
        this.delinquent = delinquent;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getObject ()
    {
        return object;
    }

    public void setObject (String object)
    {
        this.object = object;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [invoice_settings = "+invoice_settings+", metadata = "+metadata+", subscriptions = "+subscriptions+", account_balance = "+account_balance+", livemode = "+livemode+", sources = "+sources+", default_source = "+default_source+", invoice_prefix = "+invoice_prefix+", created = "+created+", description = "+description+", discount = "+discount+", tax_info_verification = "+tax_info_verification+", payment_methods = "+payment_methods+", shipping = "+shipping+", tax_info = "+tax_info+", delinquent = "+delinquent+", currency = "+currency+", id = "+id+", email = "+email+", object = "+object+"]";
    }
}
