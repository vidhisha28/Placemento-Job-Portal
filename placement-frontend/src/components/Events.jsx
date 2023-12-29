import React from 'react';
import './Events.css'; // You can create a separate CSS file for styling

const Events = () => {
  return (
    <div className="events-container">
      <h1 className="timeline-heading">Hiring Events Timeline</h1>
      <table className="events-table">
        <thead>
          <tr>
            <th>Event Type</th>
            <th>Company Name</th>
            <th>Semester</th>
          </tr>
        </thead>
        <tbody>
          {/* On-Campus Events */}
          <tr>
            <td>On-Campus</td>
            <td>Microsoft Engage</td>
            <td>4th Semester</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>JP Morgan 6-Month Internship (Biotech)</td>
            <td>October 6th Semester</td>
          </tr>

          {/* Off-Campus Events */}
          <tr>
            <td>Off-Campus</td>
            <td>Internships: Salesforce, DE Shaw, Intuit, Expedia</td>
            <td>Summer After 4th Semester</td>
          </tr>
          <tr>
            <td>Off-Campus</td>
            <td>Google STEP Internship</td>
            <td>September</td>
          </tr>
          <tr>
            <td>Off-Campus</td>
            <td>Google Summer of Code (GSOC)</td>
            <td>February</td>
          </tr>

          {/* Additional Events */}
          <tr>
            <td>On-Campus</td>
            <td>Expedia-Group</td>
            <td>Semester-7</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>Shell India</td>
            <td>Semester-7</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>Oyo</td>
            <td>Semester-7</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>Amadeus</td>
            <td>Semester-7</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>MAQ Software</td>
            <td>Semester-7</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>Naukri</td>
            <td>Semester-7 , August</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>Natwest</td>
            <td>Semester-7</td>
          </tr>
          <tr>
            <td>On-Campus</td>
            <td>BlackRock</td>
            <td>Semester-7</td>
          </tr>
          {/* Add more rows as needed */}
        </tbody>
      </table>
    </div>
  );
};

export default Events;
