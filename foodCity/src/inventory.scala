class inventory {
  var item1:item = new item("001","Apple",25.00,20)
  var item2:item = new item("002","Orange",15.00,20)
  var item3:item = new item("003","Pear",20.50,20)

  def addItem(ID:String,quntity:Int): Unit ={
      var tag:String = ID
      tag match{
        case "001" => item1.itemQuantity = item1.itemQuantity+quntity
        case "002" => item2.itemQuantity = item2.itemQuantity+quntity
        case "003" => item3.itemQuantity = item3.itemQuantity+quntity
        case _ => println("ERROR: Invalid ItemID")
      }
  }

  def reduceItem(ID:String,quntity:Int): Unit ={
    var tag:String = ID
    tag match{
      case "001" =>
        if(item1.itemQuantity<quntity)
          println("ERROR: Invalid amount")
        else
          item1.itemQuantity = item1.itemQuantity-quntity
      case "002" =>
        if(item2.itemQuantity<quntity)
          println("ERROR: Invalid amount")
        else
          item2.itemQuantity = item2.itemQuantity-quntity
      case "003" =>
        if(item3.itemQuantity<quntity)
          println("ERROR: Invalid amount")
        else
          item3.itemQuantity = item3.itemQuantity-quntity
      case _ => println("ERROR: Invalid ItemID")
    }
  }

  def displayInventory(): Unit ={
    println("ID\tNAME\t\tPRICE\tQUANTITY")
    println(item1.itemID+"\t"+item1.itemName+"\t\t"+item1.itemPrice+"\t"+item1.itemQuantity)
    println(item2.itemID+"\t"+item2.itemName+"\t\t"+item2.itemPrice+"\t"+item2.itemQuantity)
    println(item3.itemID+"\t"+item3.itemName+"\t\t"+item3.itemPrice+"\t"+item3.itemQuantity)
    println("------------------------------------------------------------------------------")
  }

  def updateItemPrice(ID:String,newPrice:Double): Unit ={
    var tag:String = ID
    tag match{
      case "001" => item1.itemPrice = newPrice
      case "002" => item2.itemPrice = newPrice
      case "003" => item3.itemPrice = newPrice
      case _ => println("ERROR: Invalid ItemID")
    }
  }

  def purchaseItem(ID:String,quntity:Int): Double ={
    var tag:String = ID
    tag match{
      case "001" =>
        if(item1.itemQuantity<quntity) {
          println("ERROR: Invalid amount")
          return 0
        }
        else {
          item1.itemQuantity = item1.itemQuantity - quntity
          return item1.itemPrice
        }
      case "002" =>
        if(item2.itemQuantity<quntity) {
          println("ERROR: Invalid amount")
          return 0
        }
        else {
          item2.itemQuantity = item2.itemQuantity - quntity
          return item2.itemPrice
        }
      case "003" =>
        if(item3.itemQuantity<quntity) {
          println("ERROR: Invalid amount")
          return 0
        }
        else {
          item3.itemQuantity = item3.itemQuantity - quntity
          return item3.itemPrice
        }
      case _ =>
        println("ERROR: Invalid ItemID")
        return 0
    }
  }

}
