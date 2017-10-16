package bookExamples.Chpt9
import bookExamples.Chpt9.Widget

class Button(val label: String) extends Widget with Clickable {

  protected def updateUI(): Unit = { /* logic to change GUI appearance */ }
}
