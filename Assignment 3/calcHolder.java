
/**
* calcHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calc.idl
* Sunday, 8 May, 2022 4:19:52 PM IST
*/

public final class calcHolder implements org.omg.CORBA.portable.Streamable
{
  public calc value = null;

  public calcHolder ()
  {
  }

  public calcHolder (calc initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = calcHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    calcHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return calcHelper.type ();
  }

}