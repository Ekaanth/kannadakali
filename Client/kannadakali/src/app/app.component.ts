import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AppService } from './app.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  public userdetails: FormGroup;
  public emailPattern = '^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$';
  public mobileNumber = '^[789]+[0-9]{9,9}$';
  public name = '^[A-Za-z]{3,15}$';
  public years = '^[0-99]{0,2}$';
  constructor(private fb: FormBuilder , private service: AppService) {}

  ngOnInit() {
    this.userdetails = this.fb.group({
      uname: [null, Validators.compose([Validators.required, Validators.pattern(this.name)])],
      uoriginalplace: [null, Validators.compose([Validators.required, Validators.pattern(this.name)])],
      uoccupation: [null, Validators.compose([Validators.required, Validators.pattern(this.name)])],
      ustayduration: [null, Validators.compose([Validators.required , Validators.pattern(this.years)])],
      uemail: [null, Validators.compose([Validators.required , Validators.pattern(this.emailPattern)])],
      umobilenumber: [null , Validators.compose([Validators.pattern(this.mobileNumber)])]
    });
  }

  userFormSubmit(userdetails) {
    console.log(userdetails);
    this.service.registeruser(userdetails).subscribe(data => data , error => console.log(error));
  }
}
