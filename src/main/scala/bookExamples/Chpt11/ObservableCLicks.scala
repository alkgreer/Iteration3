package bookExamples.Chpt11
import bookExamples.Chpt11._

trait ObservableClicks extends Clickable with Subject[Clickable] {
  abstract override def click(): Unit = {        // <1>
    super.click()
    notifyObservers(this)
  }
}
