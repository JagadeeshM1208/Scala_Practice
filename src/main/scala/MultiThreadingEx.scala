object MultiThreadingEx extends App{
  var t1 = new ThreadExample()
  t1.start()
  t1.task()
}

class ThreadExample() extends Thread{
  override def run(){
    for(i<- 0 to 5){
      println("run method"+i)
      Thread.sleep(500)
    }
  }
  def task(){
    for(i<- 0 to 5){
      println("task method"+i)
      Thread.sleep(200)
    }
  }
}

