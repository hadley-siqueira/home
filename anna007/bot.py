
import https://discordapp.com


TOKEN = 'NDQ5MjQ5NjgyMzQyOTM2NTk3.Deh9vQ.AQhehr--yMNcuzZNsN2rvU9j8xU'

client = discord.Client()

@client.event
async def on_message(message):
    if message.author == client.user:
        return

    if message.content.startswith('!hello'):
        msg = 'Hello {0.author.mention}'.format(message)
        await client.send_message(message.channel, msg)

@client.event
async def on_ready():
    print('Logged in as')
    print(client.user.name)
    print(client.user.id)
    print('------')

client.run(TOKEN)
