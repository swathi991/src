object hello_world {
  def main(args: Array[String]): Unit = {
   val num= List(1 to 100)
    var count=0
    for (i<- 2 to 100){
      if((2 until i) forall(x=> i%x !=0))
        count =count+1

    }

    println(count)
  }
}
