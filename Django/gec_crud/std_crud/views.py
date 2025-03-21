from django.shortcuts import render , redirect
from .import models , forms
 


# Create your views here.
def home(request):
    if request.method=="POST":
        student_form=forms.Studentform(request.POST)
        if student_form.is_valid():
            student_form.save()
            student_form=forms.Studentform()
        else:
            student_form=forms.Studentform()

    students = models.Student.objects.all()
    context={students:students}
    student_form=forms.Studentform()
    context={
    "students": students,
    "student_form":student_form
}
    
    
    return render(request ,"home.html",context)

def edit_student(request,id):
    student=models.Student.objects.get(id=id)
    if request.method=="POST":
        std_form=forms.Studentform(request.POST, instance=student)
        if std_form.is_valid():
            std_form.save()
            return redirect("home")
    else:
        student_form=forms.Studentform(instance=student)
    context={"student_form":student_form}
    return render(request,"edit.html",context)

def delelte_student(request,id):
    student=models.Student.objects.get(id=id)
    if student:
        student.delete()
        return redirect("home")
    
def about(request):
    return render(request ,"about.html")
