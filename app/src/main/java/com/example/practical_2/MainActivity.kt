<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/main"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="#FFFF00"
tools:context=".MainActivity"
tools:ignore="ExtraText">

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello World!"
android:textColor="#03A9F4"
android:textSize="34sp"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintEnd_toEndOf="parent"
app:layout_constraintStart_toStartOf="parent"
app:layout_constraintTop_toTopOf="parent" />

<TextView
android:id="@+id/textView"
android:layout_width="418dp"
android:layout_height="66dp"
android:background="#343F76"
android:text="MADPRACTICAL-1"
android:textAlignment="viewStart"
android:textColor="#FFFFFF"
android:textSize="28sp"
app:layout_constraintStart_toStartOf="parent"
tools:layout_editor_absoluteY="-4dp" />

<TextView
android:layout_width="339dp"
android:layout_height="45dp"
android:layout_marginStart="48dp"
android:background="#02061B"
android:text="on Resume function called"
android:textAlignment="textEnd"
android:textColor="#FFFFFF"
android:textSize="28sp"
app:layout_constraintStart_toStartOf="parent"
tools:layout_editor_absoluteY="531dp" />

<Button
android:id="@+id/showSnackbarButton"
android:layout_width="253dp"
android:layout_height="41dp"
android:layout_centerInParent="true"
android:textColor="#000000"
android:text="onResume function called"
tools:layout_editor_absoluteX="79dp"
tools:layout_editor_absoluteY="628dp" />
android:text=&quot;Show Snackbar&quot; /&gt;



</androidx.constraintlayout.widget.ConstraintLayout>