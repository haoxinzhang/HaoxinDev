import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { from, fromEventPattern, Observable } from 'rxjs';
import { User } from './User';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  userDataSource: Observable<User[]>;
  url = 'https://jsonplaceholder.typicode.com/posts';

  constructor( private http: HttpClient ) {}

  getPosts() {
    this.userDataSource = this.http.get<User[]>(this.url);
  }

  ngOnInit() {
    this.getPosts();
  }

}  
