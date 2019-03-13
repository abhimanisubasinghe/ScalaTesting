object cashier {
  var billAmount:Double = 0.0

  def main(args: Array[String]): Unit ={
    var newInventory:inventory = new inventory()
    var opt:Int = 0
    var ID:String = "000"
    var quantity:Int = 0
    var newPrice:Double = 0.0
    do{
      println("\nSelect your option:\n1.View Inventory\n2.Add items to the inventory\n3.Delete itemsfrom the inventory\n4.Update the prices\n5. Make a Purchase\n6. Exit")
      print("Enter your option: ")
      opt = scala.io.StdIn.readInt()
      opt match{
        case 1 => newInventory.displayInventory()
        case 2 =>
          newInventory.displayInventory()
          print("Enter item ID to be added: ")
          ID = scala.io.StdIn.readLine()
          print("Enter quantity to be added: ")
          quantity = scala.io.StdIn.readInt()
          newInventory.addItem(ID,quantity)
        case 3 =>
          newInventory.displayInventory()
          print("Enter item ID to be reduced: ")
          ID = scala.io.StdIn.readLine()
          print("Enter quantity to be reduced: ")
          quantity = scala.io.StdIn.readInt()
          newInventory.reduceItem(ID,quantity)
        case 4 =>
          newInventory.displayInventory()
          print("Enter item ID to be updated: ")
          ID = scala.io.StdIn.readLine()
          print("Enter the new price: ")
          newPrice = scala.io.StdIn.readDouble()
          newInventory.updateItemPrice(ID,newPrice)
        case 5 =>
          newInventory.displayInventory()
          var pOpt:Int = 0
          billAmount = 0.0
          do{
            println("1.Purchase an item\n2.Checkout")
            print("Enter your option: ")
            pOpt = scala.io.StdIn.readInt()
            pOpt match{
              case 1 =>
                print("Enter item ID to be purchased: ")
                ID = scala.io.StdIn.readLine()
                print("Enter the quantity: ")
                quantity = scala.io.StdIn.readInt()
                billAmount = billAmount+(quantity*newInventory.purchaseItem(ID,quantity))
              case 2 =>
                println("Purchase Successful")
                println("Your bill amount is "+billAmount)
              case _ =>
                println("ERROR: Invalid option")
            }
          }while(pOpt!=2)
        case 6 =>
          println("Thankyou!")
        case _ =>
          println("ERROR: Invalid option")
      }
    }while(opt!=6)

  }
}
