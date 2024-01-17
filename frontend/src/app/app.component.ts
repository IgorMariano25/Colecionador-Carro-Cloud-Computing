import { Component, ElementRef, ViewChild, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { VisibilityService } from './services/VisibilityService/visibility.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  // @ViewChild('navbar') header!: ElementRef;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    public visibilityService: VisibilityService) { }

  ngOnInit() {
    this.route.fragment.subscribe((fragment: string | null) => {
      if (fragment) {
        this.scrollToElement(fragment);
      }
    });
  }

  redirectToAboutPage(fragment: string) {
    this.router.navigate(['/About'], { fragment: fragment });
  }

  redirectToPageIdHtml(page: string, idHtml: string) {
    this.router.navigate(['/' + page], { fragment: idHtml }).then(() => {
    });
  }

  smoothScrollTo(endX: number, endY: number, duration: number): void {
  smoothScrollTo(endX: number, endY: number, duration: number): void {
    const startX: number = window.scrollX;
    const startY: number = window.scrollY;
    const distanceX: number = endX - startX;
    const distanceY: number = endY - startY;
    const startTime: number = new Date().getTime();

    duration = typeof duration !== "undefined" ? duration : 400;

    const easeInOutQuart = (time: number, from: number, distance: number, duration: number): number => {
      if ((time /= duration / 2) < 1)
        return (distance / 2) * time * time * time * time + from;
      return (-distance / 2) * ((time -= 2) * time * time * time - 2) + from;
    };

    const timer = setInterval(() => {
      const time: number = new Date().getTime() - startTime;
      const newX: number = easeInOutQuart(time, startX, distanceX, duration);
      const newY: number = easeInOutQuart(time, startY, distanceY, duration);
      if (time >= duration) {
        clearInterval(timer);
      }
      window.scroll(newX, newY);
    }, 1000 / 60);
  }

  private scrollToElement(id: string) {
    const offsetTop = 85;

    setTimeout(() => {
      const element = document.getElementById(id);
      if (element) {
        const elementPosition = element.getBoundingClientRect().top + window.scrollY;
        const offsetPosition = elementPosition - offsetTop;

        this.smoothScrollTo(0, offsetPosition, 3000);
      }
    });
  }
}

