package builder

data class Data(
    val title: String,
    val task: String,
    val abstract: String,
    val contents: String,
    val body: String,
    val sources: List<String>,
    val appendices: List<String>
)