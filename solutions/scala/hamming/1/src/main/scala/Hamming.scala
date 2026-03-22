object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] = {
    if (dnaStrandOne.length != dnaStrandTwo.length) {
      None
    } else {
      val differencesCount = dnaStrandOne.zip(dnaStrandTwo).count {
        case (a, b) => a != b
      }
      Some(differencesCount)
    }
  }
}