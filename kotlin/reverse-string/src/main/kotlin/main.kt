fun reverse(text: String): String {
    return text.mapIndexed { index, _ -> text[text.length - 1 - index] }.joinToString("")
}