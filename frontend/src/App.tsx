import { useState } from 'react';
import './App.css';

type Section = 'home' | 'spaces' | 'plans' | 'contact';

function App() {
  const [activeSection, setActiveSection] = useState<Section>('home');

  return (
    <div className="app">
      <nav className="navbar">
        <div className="logo">🛏 BedsWithBenefits</div>
        <div className="nav-links">
          {(['home', 'spaces', 'plans', 'contact'] as Section[]).map((section) => (
            <button
              key={section}
              className={activeSection === section ? 'active' : ''}
              onClick={() => setActiveSection(section)}
            >
              {section.charAt(0).toUpperCase() + section.slice(1)}
            </button>
          ))}
        </div>
      </nav>

      <main className="main-content">
        {activeSection === 'home' && (
          <section className="section">
            <h1>Welcome to BedsWithBenefits</h1>
            <p>
              Redefining urban living through shared spaces, smart connections, and sustainable community living.
              Discover a more flexible and affordable way to live and work.
            </p>
          </section>
        )}

        {activeSection === 'spaces' && (
          <section className="section">
            <h2>Our Shared Spaces</h2>
            <div className="categories">
              <div className="category">
                <h3>City Co-Living</h3>
                <ul>
                  <li>Fully furnished shared apartments</li>
                  <li>Private bedrooms & community lounges</li>
                  <li>Weekly cleaning & all-inclusive bills</li>
                </ul>
              </div>
              <div className="category">
                <h3>Remote Retreats</h3>
                <ul>
                  <li>Flexible short-term stays</li>
                  <li>Nature-integrated co-homes</li>
                  <li>High-speed WiFi and shared kitchens</li>
                </ul>
              </div>
              <div className="category">
                <h3>Hybrid Housing</h3>
                <ul>
                  <li>Work + Sleep solutions</li>
                  <li>Community-driven living</li>
                  <li>For digital nomads and creatives</li>
                </ul>
              </div>
            </div>
          </section>
        )}

        {activeSection === 'plans' && (
          <section className="section">
            <h2>Flexible Plans</h2>
            <ul className="hours-list">
              <li><strong>Starter Plan:</strong> €300/month — Shared room, utilities included</li>
              <li><strong>Comfort Plan:</strong> €450/month — Private room, co-living access</li>
              <li><strong>Freedom Plan:</strong> €600/month — Private suite, all benefits + events</li>
            </ul>
          </section>
        )}

        {activeSection === 'contact' && (
          <section className="section">
            <h2>Join Our Community</h2>
            <form className="form" onSubmit={(e) => e.preventDefault()}>
              <div className="form-group">
                <label htmlFor="name">Full Name:</label>
                <input type="text" id="name" required />
              </div>
              <div className="form-group">
                <label htmlFor="email">Email Address:</label>
                <input type="email" id="email" required />
              </div>
              <div className="form-group">
                <label htmlFor="movein">Preferred Move-in Date:</label>
                <input type="date" id="movein" required />
              </div>
              <div className="form-group">
                <label htmlFor="location">Preferred Location:</label>
                <input type="text" id="location" required />
              </div>
              <div className="form-group">
                <label htmlFor="plan">Interested Plan:</label>
                <select id="plan" required>
                  <option value="">Select a plan</option>
                  <option value="starter">Starter</option>
                  <option value="comfort">Comfort</option>
                  <option value="freedom">Freedom</option>
                </select>
              </div>
              <button type="submit" className="submit-btn">Request Info</button>
            </form>
          </section>
        )}
      </main>

      <footer className="footer">
        <p>© 2024 BedsWithBenefits. All rights reserved.</p>
        <p>Headquarters: 123 Urban Lane, CoLiving City, EU</p>
        <p>📞 +32 123 456 789 | ✉️ contact@bedswithbenefits.com</p>
      </footer>
    </div>
  );
}

export default App;
