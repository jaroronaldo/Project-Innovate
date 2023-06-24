//1
//Creating a Kotlin class containing the project title
class ProjectInnovate {
	//2
	//Constructor that stores the project title
	private var title: String
	
	constructor(title: String) {
		this.title = title
	}
	//3
	//Function to set the project title
	fun setProjectTitle(title: String) {
		this.title = title
	}
	//4
	//Function to get the project title
	fun getProjectTitle() : String {
		return this.title
	}
	//5
	//Function to describe the project
	fun describeProject() {
		println("Project Innovate is a project to develop innovative solutions to existing problems")
	}
	//6
	//Function to define project objectives
	fun defineObjectives() {
		println("Project objectives include:")
		println("1. To develop innovative solutions to existing problems")
		println("2. To generate new ideas and concepts")
		println("3. To create prototypes and test them")
		println("4. To deploy successful solutions on a large scale")
	}
	//7
	//Function to get project team members
	fun getProjectTeam() : ArrayList<String> {
		val teamMembers = ArrayList<String>()
		teamMembers.add("Alan")
		teamMembers.add("Bob")
		teamMembers.add("Cathy")
		teamMembers.add("David")
		
		return teamMembers
	}
	//8
	//Function to define project timeline
	fun defineTimeline() {
		println("Project timeline:")
		println("1. Define project objectives (1 month)")
		println("2. Develop solution concepts (2 months)")
		println("3. Develop prototypes (3 months)")
		println("4. Test prototypes (4 months)")
		println("5. Deploy successful solutions (5 months)")
	}
	//9
	//Function to define project budget
	fun defineBudget() {
		println("Project budget:")
		println("1. Personnel costs: $1000")
		println("2. Equipment costs: $2000")
		println("3. Software costs: $3000")
		println("4. Miscellaneous costs: $4000")
		println("Total project budget: $10000")
	}
	//10
	//Function to define project risks
	fun defineRisks() {
		println("Project risks include:")
		println("1. Failure to develop innovative solutions")
		println("2. Late delivery of solution prototypes")
		println("3. Inadequate testing of prototypes")
		println("4. Unforeseen technical issues")
	}
	//11
	//Function to define project deliverables
	fun defineDeliverables() {
		println("Project deliverables include:")
		println("1. Solution concepts")
		println("2. Prototype solutions")
		println("3. Test plans and results")
		println("4. Deployment plans")
	}
	//12
	//Function to display all information
	fun displayInformation() {
		println("Project Title: ${this.title}")
		describeProject()
		println()
		defineObjectives()
		println()
		println("Project Team: ${getProjectTeam()}")
		println()
		defineTimeline()
		println()
		defineBudget()
		println()
		defineRisks()
		println()
		defineDeliverables()
	}
}
//13
//Creating a main function to test the class
fun main(args: Array<String>) {
	val project = ProjectInnovate("Project Innovate")
	project.displayInformation()
}