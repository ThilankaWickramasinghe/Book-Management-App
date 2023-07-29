import express from 'express';

export const router = express.Router();

router.delete('/:isbn', async (req, res) => {

    res.send("<h1>Delete a book</h1>")

});

router.patch('/:isbn', async (req, res) => {
    res.send("<h1>Update the book</h1>")
});

