import { Injectable } from '@angular/core';
import { Http, Response, ResponseContentType, Headers } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';
import 'rxjs/add/operator/catch';


@Injectable()
export class AppService {
    private base_url: string;

    constructor(private http: Http) {
        this.base_url = '';
    }

    pageVisit(ipdata) {
        const url = `${this.base_url}/kannadakali/resources/api/pagevisit`;
        return this.http.post(url , ipdata).map(res => res.json());
    }

    registeruser(user) {
        const url = `${this.base_url}/kannadakali/resources/api/registeruser`;
        return this.http.post(url , user).map(res => res.json());
    }
}
