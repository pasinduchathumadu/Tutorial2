object Main {
  def main(args: Array[String]): Unit = {
    println("The total salary is:"+total_salary(250,85))
  }
  def normal_hours(x:Int):Int={  //calculate the total payment of normal working hours
    return x*40
  }
  def OT_hours(y:Int):Int={    //calculate the total payment of OT hours  and this function return a integer value
    return y*30
  }
  def income(x:Int,y:Int):Int={ //adding above values and get total income
    return normal_hours(x)+OT_hours(y)
  }
  def tax(Income:Int):Double={  //reduce the tax
     return Income*(12.0/100.0)
  }

  def total_salary(x:Int,y:Int):Double= { //total salary is denoted by reduce the tax from the total income
    return income(x,y)-tax(income(x,y))
  }

}