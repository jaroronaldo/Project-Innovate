// File: ProjectInnovate.ts

// Importing dependencies
import * as express from 'express'; 
import { Request, Response } from 'express';

// Defining constants
const PORT: number = 3000;

// Creating the Express application
const app = express();

// Configuring the Express application
app.use(express.json());

// Setting the routes

// Homepage
app.get('/', (req: Request, res: Response) => {
  res.send('Welcome to Project Innovate!');
});

// Get all projects
app.get('/projects', (req: Request, res: Response) => {
  res.send('This route will return a list of all projects.');
});

// Create new project
app.post('/projects', (req: Request, res: Response) => {
  const { title, description } = req.body;
  
  res.send(`Creating a new project with title: ${title} and description: ${description}.`);
});

// Get single project
app.get('/projects/:id', (req: Request, res: Response) => {
  const { id } = req.params;
  
  res.send(`Getting project with id: ${id}`);
});

// Update single project
app.put('/projects/:id', (req: Request, res: Response) => {
  const { id } = req.params;
  const { title, description } = req.body;
  
  res.send(`Updating project with id: ${id}, title: ${title} and description: ${description}.`);
});

// Delete single project
app.delete('/projects/:id', (req: Request, res: Response) => {
  const { id } = req.params;
  
  res.send(`Deleting project with id: ${id}.`);
});

// Starting the server
app.listen(PORT, () => {
  console.log(`Server is running on port ${PORT}`);
});