package pojo;

public class Payment_methods
{
    private String[] data;

    private String has_more;

    private String url;

    private String object;

    public String[] getData ()
    {
        return data;
    }

    public void setData (String[] data)
    {
        this.data = data;
    }

    public String getHas_more ()
    {
        return has_more;
    }

    public void setHas_more (String has_more)
    {
        this.has_more = has_more;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
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
        return "ClassPojo [data = "+data+", has_more = "+has_more+", url = "+url+", object = "+object+"]";
    }
}
