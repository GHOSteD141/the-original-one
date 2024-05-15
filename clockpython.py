from tkinter import *
from tkinter.ttk import *
from time import strftime

def update_clock(label):
    string=strftime('%H:%M:%S:%p')
    label.config(text=string)

def schedule_update(label):
    update_clock(label)
    label.after(1000,lambda: schedule_update(label))

root=Tk()
root.title("clock")

clock_label=Label(root,font=("ds-digital",80),background="red",foreground="green")
clock_label.pack(anchor='center')

schedule_update(clock_label)
root.mainloop()