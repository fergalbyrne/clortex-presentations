## Author: Fergal Byrne

Fergal Byrne is the founder of the Clortex Open Source Machine Intelligence project. Fergal has been working with computers since he got a 16Kb Sinclair Spectrum for Christmas 1983. After studying Engineering, Computer Science and Pure Maths at UCD, he worked on DEEP, a project to develop an open standard and software for the exploration and mining industries.

In 1995, Fergal co-founded Adnet, Ireland's oldest web develpment company, and over the next sixteen years, he pioneered the use of new technologies to bring businesses and organisations into the Internet age. These included Ireland's first eCommerce site (Fred Hanna's Bookstore 1996), its first dynamic website (Dublin Chamber of Commerce written in Perl 1995), the first database-backed site (DCC 1996), the first CMS and mass hosted multisite (ChamberNet, 250 companies 1997), and so on.

Fergal is always in search of new technologies which change what he and his customers can achieve. He adopted Linux in 1992, Apache in 1994 (then NCSA httpd), PHP in 1995 (then PHP/FI), MySQL in 1995 (then mSQL), Ruby in 2002 etc.

Fergal has been following Jeff Hawkins' work for several years. In 2013 Numenta open sourced NuPIC, their platform for intelligent computing. Fergal has been a significant contributor to the community of theorists, researchers and deveopers which has grown up around NuPIC in the past year. In December 2013, Fergal was contracted to conduct R&D on combining the CEPT Cortical Engine for Processing Text with the NuPIC system. The result of this was the decision to build Clortex.

## Title: Real Machine Intelligence with Clortex

## Abstract

### Goal:

The goal of the talk is to introduce Jeff Hawkins' theories as a basis for intelligent computing; to describe how Clortex can be used for both research and development of new applications of Machine Intelligence, and finally do describe some of the key design decisions made in developing a large cortical information processor in Clojure. The attendee will learn about a new vision for understanding how the brain works; a system for developing genuinely intelligent software and hardware based on neuroscience, and how to use the Clojure ecosystem to address large-scale design and development issues.


### Description: Explain in detail how you presentation will be structured, what methodology and technology you will introduce, what examples you will use, etc.

The presentation will begin with a 3-minute demo of Clortex in action. The demo consists of:

1. A visual example of Clortex processing and intelligently responding to a real-world problem.
2. A simultaneous set of visualisations showing the inner workings of the neural regions inside Clortex.
3. Live manipulation of the algorithms used, and a demonstration of how this affects learning and performance in Clortex.

The first section is a crash course in understanding the neocortex: the seat of intelligence in the brain.

The next section will briefly introduce Jeff Hawkins' theories of Hierarchical Temporal Memory and the Cortical Learning Algorithm, with the key principles of how the neocortex identifies spatial patterns in data and learns sequences of those patterns.

Following this is a brief history of efforts to implement systems based on HTM/CLA, including Numenta's NuPIC, Dileep George's Vicarious, CEPT's Cortical Engine for Text Processing, and a number of hardware projects currently in development at Sandia Labs etc.

The remainder of the talk is about Clortex:

1. Key Design Goals in Clortex
2. Architectural decisions
3. Use of Clojure, Datomic, and various tools and libraries.
4. How Clortex implements key aspects of HTM/CLA.
5. Performance, scalability and flexibility.
5. What can you use Clortex for?
6. What's next for Clortex and HTM/CLA?

The talk will end with an introduction to the vibrant community growing up around HTM/CLA, NuPIC and Clortex, and a call to join in our effort to achieve true intelligent computing in the next few years.

### Combo: If your presentation combines a Talk with a Workshop, describe how the two components relate and how they will work together to achieve the desired learning outcome.

The talk will introduce and demonstrate the principles behind HTM/CLA and Clortex, and also briefly go through key aspects of the technology. The workshop is split along similar lines, but will focus in depth on each aspect mentioned in the talk.

One of the key issues with Jeff's work is that it can be very difficult for newcomers to grasp the key concepts in the theory and relate them to existing designs in software. Clortex is specifically deisgned to address this issue. Thus, the early part of the workshop will be devoted to using Clortex as a teaching tool, which visually and interactively connects with the (small- and large-scale) models in the theory and the implementation.

The second part of the workshop is devoted to learning how to use Clortex for attendees' own machine or data intelligence tasks. This will take the form of a tutorial in which we will use Clortex on a real-world example data source, have the system learn the spatio-temporal structure in the data, and derive knowledge from the data which is of use.

The third part of the workshop will explain how to use Clortex for research and development in Machine Intelligence. Creating multilayer neural structures, combining patches of neurons into hierarchies, and working on new kinds of data, etc.

It would be great if some attendees would be willing to participate in a live networked Clortex session, where each attendee's computer is running part of a single Clortex neural system. This would obviously require some preparation with the event organisers.

The final part of the workshop will be about the future of HTM/CLA and the developments in both theory and software/hardware currently underway.

### Pre-Requisites: Specify any operating systems or tools (if required) that a participant should have installed to actively participate in your session.

For the talk, an open mind and curiosity is all that is required.

The workshop will have a github repo which will contain everything the attendee needs to run Clortex and the examples shown. The usual requirements for Clojure development apply.

For the workshop, Clortex uses datomic (any version, any configuration), and attendees would be best to install the standalone free version of datomic.

### Ancillary material: a description of supporting material, which you will provide before the conference and that we will distribute to all participants via the Lambda Jam website - this may be text in PDF format and/or code as a compressed tar file.

The talk and workshop presentations are being developed using Chris Zheng's fork of hoplon-reveal-js. The examples and code will be in the form of github repos, including documentation/examples/tests using his lein-midje-doc.

I will prepare a worksheet for participants in the workshop which will detail what they need to do if they wish to run the examples and (if possible) take part in the networked session.

### References: Is there generally available material that attendees may use after the presentation to deepen their understanding of the presented topic material? If so, please list that material.

The talk and workshop content will be available on my github under https://github.com/fergalbyrne

Clortex on Github: https://github.com/fergalbyrne/clortex
Docs/info on Clortex on https://fergalbyrne.github.io

My own blog for Clortex, HTM/CLA and Machine Intelligence: http://inbits.com

The NuPIC community at http://numenta.org (includes access to repos, mailing lists, video talks, tutorials on NuPIC, an extensive wiki, etc).

My book on leanpub.com (free to read, optionally purchase) http://leanpub.com/realsmartmachines
(this book will be completed during May 2014)



### Category	 The type of presentation you are proposing:
Combo Talk / Workshop

### Group	 Indicate the level your talk is aimed at:
Intermediate-Advanced (accessible to an intermediate audience, but topics of interest to an advanced audience)

### Topic	 Indicate the functional programming languages that you will be targeting. If the language is not listed, please select "Other" and mention it in your abstract.
Clojure (optionally with ClojureScript for visualisations and experimentation).


