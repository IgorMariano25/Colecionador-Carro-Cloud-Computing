import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private router: Router) { }

  pageUrl(urlPath: string) {
    this.router.navigate(['/About', urlPath]);
  }

  redirectToAboutPage(id: string) {
    const navigateToElement = document.getElementById(id);

    if (navigateToElement) {
      navigateToElement.addEventListener("click", () => this.pageUrl(id));
    }
  }
}

