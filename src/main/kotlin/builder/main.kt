package builder

fun main() {
    // Пример использования
    val courseworkBuilder = CourseworkReport.Builder()
    val coursework = courseworkBuilder
        .setTitle("Курсовая работа по Kotlin")
        .setTask("Разработать информационную систему с использованием Kotlin.")
        .setAbstract("Аннотация курсовой работы.")
        .setContents("Оглавление курсовой работы.")
        .setBody("Текст курсовой работы.")
        .setSources(listOf("Источник 1", "Источник 2"))
        .setAppendices(listOf("Приложение 1", "Приложение 2"))
        .build()

    println("Курсовая работа:")
    println(coursework.generateReport())

    val labBuilder = LabReport.Builder()
    val lab = labBuilder
        .setTitle("Лабораторная работа по Kotlin")
        .setTask("Реализовать примеры кода на Kotlin.")
        .setAbstract("Аннотация лабораторной работы.")
        .setContents("Оглавление лабораторной работы.")
        .setBody("Текст лабораторной работы.")
        .setSources(listOf("Источник 3", "Источник 4"))
        .setAppendices(listOf("Приложение 3", "Приложение 4"))
        .build()

    println("\nЛабораторная работа:")
    println(lab.generateReport())
}