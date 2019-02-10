package pojo;

public class Invoice_settings
{
    private String footer;

    private String custom_fields;

    public String getFooter ()
    {
        return footer;
    }

    public void setFooter (String footer)
    {
        this.footer = footer;
    }

    public String getCustom_fields ()
    {
        return custom_fields;
    }

    public void setCustom_fields (String custom_fields)
    {
        this.custom_fields = custom_fields;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [footer = "+footer+", custom_fields = "+custom_fields+"]";
    }
}
			
			
