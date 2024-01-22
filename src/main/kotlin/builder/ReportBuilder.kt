package builder

interface ReportBuilder {
    fun setTitle(title: String): ReportBuilder
    fun setTask(task: String): ReportBuilder
    fun setAbstract(abstract: String): ReportBuilder
    fun setContents(contents: String): ReportBuilder
    fun setBody(body: String): ReportBuilder
    fun setSources(sources: List<String>): ReportBuilder
    fun setAppendices(appendices: List<String>): ReportBuilder
    fun build(): Report
}