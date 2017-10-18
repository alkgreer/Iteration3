package bookExamples.Chpt11                                        // <1>

trait Clickable {
  def click(): Unit = updateUI()                                     // <2>

  protected def updateUI(): Unit                                     // <3>
}
