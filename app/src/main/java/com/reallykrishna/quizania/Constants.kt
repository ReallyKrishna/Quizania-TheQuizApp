package com.reallykrishna.quizania

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1
        val ques1 = Question(1,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1)
        questionList.add(ques1)

        //2
        val ques2 = Question(2,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_australia, "Angola", "Austria",
            "Australia", "Armenia", 3)
        questionList.add(ques2)

        //3
        val ques3 = Question(3,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_belgium, "Bahamas", "Belgium",
            "Barbados", "Belize", 2)
        questionList.add(ques3)

        //4
        val ques4 = Question(4,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_brazil, "Belarus", "Belize",
            "Brazil", "Brunei", 3)
        questionList.add(ques4)

        //5
        val ques5 = Question(5,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_fiji, "Gabon", "France",
            "Finland", "fiji", 4)
        questionList.add(ques5)

        //6
        val ques6 = Question(6,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_denmark, "Dominica", "Egypt",
            "Ethiopia", "Denmark", 4)
        questionList.add(ques6)

        //7
        val ques7 = Question(7,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_germany, "Georgia", "Germany",
            "Greece", "None Of These", 2)
        questionList.add(ques7)

        //8
        val ques8 = Question(8,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_india, "India", "Pakistan",
            "Iran", "Afghanistan", 1)
        questionList.add(ques8)

        //9
        val ques9 = Question(9,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait, "Kuwait", "Jordan",
            "Ethiopia", "Sudan", 1)
        questionList.add(ques9)

        //10
        val ques10 = Question(10,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand, "Palestine", "New Zealand",
            "Sudan", "Jordan", 2)
        questionList.add(ques10)

        return questionList
    }
}