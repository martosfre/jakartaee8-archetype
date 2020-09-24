# JAKARTAEE8 ARCHETYPE
## Description
> Repository that represents a jakartaee8 archetype, which is useful to create a Jakartaee8 project with the following structure.
>* EAR Project
>* EJB Project 
>* WEB Project 

> By default, the archetype has a project with a form to save an employee data in an h2 database, where you could see some specifications in action like Jakarta Bean Validations 2.0, Jakarta Enterprise Beans 3.2, Jakarta Persistence 2.2, and Jakarta Server Faces 2.3 in basic mode, useful to guide you through it.

## Create Project using archetype
>To create a project using the jakartaee8 archetype, you can do the following:
>1. Install the jakartaee8 archetype on your local repository.
>2. Create a project using eclipse or other IDE or once uncompresed the archetype, inside the main folder execute the following command: mvn archetype:generate -DarchetypeGroupId=com.matoosfe -DarchetypeArtifactId=jakartaee8-archetype -DarchetypeVersion=1.0 -Darchetype.interactive=false --batch-mode -DgroupId=GROUP_ID -DartifactId=PROJECT_NAME -Dversion=VERSION (don't forget to change the GROUP_ID, PROJECT_NAME and VERSION variables until to execute it)

>For more information, you can review this link: http://www.marcotoscano.org/2020/09/jakarta-ee-8-archetype.html

## Version History
>* 1.0
 * Github First Release
 
## Author
>* Marco A. Toscano Freire (@martosfre, @matoosfe), Quito- Ecuador
