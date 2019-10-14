fun reverse(text: String): String {
    var reversedString: String = ""
    for (i in text.length - 1 downTo 0) {
        reversedString += text[i]
    }
    return reversedString
}