package pojo;

public class MyPojo
{
    private Invoice_settings invoice_settings;

    private String account_balance;

    private String default_source;

    private String invoice_prefix;

    private String created;

    private String delinquent;

    private String description;

    private String discount;

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

    public String getAccount_balance ()
    {
        return account_balance;
    }

    public void setAccount_balance (String account_balance)
    {
        this.account_balance = account_balance;
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

    public String getDelinquent ()
    {
        return delinquent;
    }

    public void setDelinquent (String delinquent)
    {
        this.delinquent = delinquent;
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
        return "ClassPojo [invoice_settings = "+invoice_settings+", account_balance = "+account_balance+", default_source = "+default_source+", invoice_prefix = "+invoice_prefix+", created = "+created+", delinquent = "+delinquent+", description = "+description+", discount = "+discount+", currency = "+currency+", id = "+id+", email = "+email+", object = "+object+"]";
    }
}
	