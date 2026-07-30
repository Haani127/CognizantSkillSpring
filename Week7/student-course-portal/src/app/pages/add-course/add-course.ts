import { Component } from '@angular/core';
import { NgIf } from '@angular/common';
import { FormBuilder, FormGroup, Validators, ReactiveFormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { CourseService } from '../../services/course';

@Component({
  selector: 'app-add-course',
  imports: [ReactiveFormsModule, NgIf],
  templateUrl: './add-course.html',
  styleUrl: './add-course.css'
})
export class AddCourseComponent {
  courseForm: FormGroup;
  isSubmitting = false;
  successMessage = '';
  errorMessage = '';

  constructor(
    private fb: FormBuilder,
    private courseService: CourseService,
    private router: Router
  ) {
    this.courseForm = this.fb.group({
      name: ['', [Validators.required, Validators.minLength(3)]],
      code: ['', [Validators.required, Validators.pattern('^[A-Z]{3}[0-9]{3}$')]],
      credits: [3, [Validators.required, Validators.min(1), Validators.max(6)]],
      gradeStatus: ['pending', Validators.required],
      enrolled: [false]
    });
  }

  onSubmit(): void {
    if (this.courseForm.invalid) {
      this.courseForm.markAllAsTouched();
      return;
    }

    this.isSubmitting = true;
    this.errorMessage = '';
    this.successMessage = '';

    const newCourse = this.courseForm.value;

    this.courseService.createCourse(newCourse).subscribe({
      next: (created) => {
        this.isSubmitting = false;
        this.successMessage = `Course "${created.name}" created successfully!`;
        this.courseForm.reset({
          name: '',
          code: '',
          credits: 3,
          gradeStatus: 'pending',
          enrolled: false
        });
        setTimeout(() => {
          this.router.navigate(['/courses']);
        }, 1500);
      },
      error: (err) => {
        this.isSubmitting = false;
        this.errorMessage = err.message || 'Failed to create course. Please make sure json-server is running.';
      }
    });
  }

  onCancel(): void {
    this.router.navigate(['/courses']);
  }
}
