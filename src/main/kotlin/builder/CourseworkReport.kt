package builder
import com.google.gson.Gson

class CourseworkReport private constructor(private val data: Data) : Report {

    override fun generateReport(): String {
        val gson = Gson()
        return gson.toJson(data)
    }

    // Реализация строителя
    class Builder : ReportBuilder {
        private var title = ""
        private var task = ""
        private var abstract = ""
        private var contents = ""
        private var body = ""
        private var sources = mutableListOf<String>()
        private var appendices = mutableListOf<String>()

        override fun setTitle(title: String): ReportBuilder {
            this.title = title
            return this
        }

        override fun setTask(task: String): ReportBuilder {
            this.task = task
            return this
        }

        override fun setAbstract(abstract: String): ReportBuilder {
            this.abstract = abstract
            return this
        }

        override fun setContents(contents: String): ReportBuilder {
            this.contents = contents
            return this
        }

        override fun setBody(body: String): ReportBuilder {
            this.body = body
            return this
        }

        override fun setSources(sources: List<String>): ReportBuilder {
            this.sources.addAll(sources)
            return this
        }

        override fun setAppendices(appendices: List<String>): ReportBuilder {
            this.appendices.addAll(appendices)
            return this
        }

        override fun build(): Report {
            val commonData = Data(title, task, abstract, contents, body, sources, appendices)
            return CourseworkReport(commonData)
        }
    }
}