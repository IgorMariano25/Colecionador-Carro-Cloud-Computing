import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'like-button',
  templateUrl: './like-button.component.html',
  styleUrls: ['./like-button.component.css']
})
export class LikeButtonComponent implements OnInit {

  ngOnInit() {
    document.addEventListener('DOMContentLoaded', () => {
      document.addEventListener('click', this.handleClick);
    });
  }

  handleClick(e: Event) {
    const target = e.target as HTMLElement;

    if (target.classList.contains('like-review')) {
      target.innerHTML = '<i class="fa fa-heart" aria-hidden="true"></i> You liked this';
      const heartIcon = target.querySelector('.fa-heart') as HTMLElement;
      if (heartIcon) {
        heartIcon.classList.add('animate-like');
      }
      document.removeEventListener('click', this.handleClick);
    }
  }
}
