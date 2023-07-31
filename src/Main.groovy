
   def countElements(list) {
    def countMap = [:]

    list.each { element ->
      countMap[element] = countMap.get(element, 0) + 1
    }

    return countMap
  }


  def list = [1, 2, 4, 2, 1, 5, 4]
  def result = countElements(list)

  println result
