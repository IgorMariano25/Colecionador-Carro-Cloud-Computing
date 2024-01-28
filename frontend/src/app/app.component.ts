import { Component, ElementRef, ViewChild, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { VisibilityService } from './services/VisibilityService/visibility.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {

  constructor(
    public router: Router,
    public route: ActivatedRoute,
    public visibilityService: VisibilityService) { }

  ngOnInit() {
    this.route.fragment.subscribe((fragment: string | null) => {
      if (fragment) {
        this.scrollToElement(fragment);
      }
    });
  }

  public redirectToPage(page: string) {
    this.router.navigate(['/' + page]).then(() => {
      window.scrollTo(0, 0);
    });
  }

  public redirectToPageIdHtml(page: string, idHtml: string) {
    this.router.navigate(['/' + page], { fragment: idHtml }).then(() => {
    });
  }

  public redirectToPageIdHtmlByOtherPage(page: string, idHtml: string) {
    this.router.navigate(['/' + page], { fragment: idHtml }).then(() => {
      window.scrollTo(0, 0)
    });
  }

  public smoothScrollTo(endX: number, endY: number, duration: number): void {
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

  public scrollToElement(id: string) {
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

  public openMenuMobile() {
    // let menuMobile = document.querySelector(".popup");
    // popup?.classList.add("open__popup");

    // let popupBackgroundView = document.querySelector(".popup__view");
    // popupBackgroundView?.classList.add("active");
  }

  public closeMenuMobile() {
    // let menuMobile = document.getElementsByTagName("nav");
    // let menuBackgroundView = document.querySelector(".popup__view");
    // popup?.classList.remove("open__popup");
    // popupBackgroundView?.classList.remove("active");
  }
}

