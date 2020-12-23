# Multi-Threaded-ReadFiles

Each file contains a certain amount of words, and each file is read using a single thread when we do not know how many files there are.
Each of the threads reads the word from the file and inserts it into the linked list. If the word already exists it increases the numbering of the word.
After the threads have finished their work executed bubbles sort for the linked list which sorts the words alphabetically. 
Finally a function is activated which goes over the list and finds the word that appears most often in all the files([algorithms,34]).
