object ReverseString {
  def reverse(str: String): String = {
    val letters = str.toList

    
    def reversor(strAccumulator: String, remainingLetters: List[Char]): String = {
      remainingLetters match {
        case Nil => strAccumulator // Base case: no more letters to process
        case head :: tail => reversor(head + strAccumulator, tail) // Recursive step
      }
    }

    reversor("", letters)
  }
}
