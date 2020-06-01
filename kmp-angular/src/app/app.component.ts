import { Component } from '@angular/core';
import { org } from 'kmp-share-kmp-common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'kmp-angular';
  obj = new org.example.kmp.common.SampleDTO(
    'angular string',
    55,
    true
  );
  private requestBack = new org.example.kmp.common.RequestBack();

  async click() {
    this.obj = await this.requestBack.requestPromise('angular string');
  }
}
