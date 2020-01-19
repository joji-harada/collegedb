# Java College Database Search and Sort

## Multi-faceted program designed to organize and filter a csv DB of enrolled students at a college.

### Notable class structures:
- [ ] Student class with a builder class to allow instantiation of new Student objects from a csv file.
- [ ] Batch class with generic data search, sorting and filtering algorithms. This allows the filter class to utilize binary searches and quicksorting algorithms using lambda syntax.
- [ ] A custom created circular singly linked list data structure including search, add and remove methods as well as a functional iterator.
- [ ] Enums to store constants within the student data structure. These include: Rank, Major and Title (course title).
- [ ] Filter class that holds methods that the Student linked list utilizes to filter, sort and search. As stated above the Filter class uses algorithms in the Batch class, but implements File, PrintStream and Scanner libraries to read from and write to new files.

![gif of the project](https://media.giphy.com/media/WUNzwoLqG9WcQwjPMj/giphy.gif "Java College DB Project")

Student-01.txt file is a sample csv file template used to read in data to be stored as a linked list. AlphaCollege.txt is an example of the filtering and sorting accomplished using the simple alphabetizing filter method. This also exemplifies the programs ability to format the data as an easy-to-read output.
