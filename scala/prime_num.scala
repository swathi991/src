object prime_num {

  def checkPrime(n: Int): Boolean = {
    (2 until n) forall (i=> n % i != 0)
  }

  def main(args: Array[String]): Unit = {
    var count=0
    for (i<- 1 to 1000)
      {
        if (i==1)
          count=count
        else if (checkPrime(i))
          count=count+1
      }
       println(count)

  }
}

