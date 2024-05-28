class Solution {
    fun simplifyPath(path: String): String {
        
        val parts = path.split("/").filter {
            it.isNotEmpty() && it != "."
        }
        val stack = ArrayDeque<String>()

        for (part in parts) {
            when (part) {
                ".." -> {
                    if( stack.isNotEmpty() ) {
                        stack.removeLast()
                    }
                }
                else -> stack.add(part)
            }
        }

        return "/" + stack.joinToString("/")
    }
}