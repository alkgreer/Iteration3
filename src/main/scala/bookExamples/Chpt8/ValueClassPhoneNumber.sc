class USPhoneNumber( val s: String) extends AnyVal {
  override def toString = {
    val digs = digits(s)
    val areaCode = digs.substring(0,3)
    val exchange = digs.substring(3,6)
    val subnumber = digs.substring(6,10) //"subscriber number"
    s"($areaCode) $exchange-$subnumber"
  }

  private def digits(str: String): String = str.replaceAll("\\D","")//D finds nondigits
}

val number = new USPhoneNumber("987-654-3210")
